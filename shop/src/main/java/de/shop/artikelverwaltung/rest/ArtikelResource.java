package de.shop.artikelverwaltung.rest;

import static de.shop.util.Constants.SELF_LINK;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.MediaType.APPLICATION_XML;
import static javax.ws.rs.core.MediaType.TEXT_XML;

import java.net.URI;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Link;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import de.shop.artikelverwaltung.domain.Artikel;
import de.shop.bestellverwaltung.rest.BestellungResource;
import de.shop.kundenverwaltung.domain.AbstractKunde;
import de.shop.util.Mock;
import de.shop.util.rest.NotFoundException;
import de.shop.util.rest.UriHelper;

//FIXME
@Path("/artikel")
@Produces({ APPLICATION_JSON, APPLICATION_XML + ";qs=0.75", TEXT_XML + ";qs=0.5" })
@Consumes
public class ArtikelResource {
	@Context
	private UriInfo uriInfo;
	
	@Inject
	private UriHelper uriHelper;
	
//	@Inject
//	private BestellungResource bestellungResource;
	
	@GET
	@Path("{id:[1-9][0-9]*}")
	public Response findArtikelById(@PathParam("id") Long id) {
		
		final Artikel artikel = Mock.findArtikelById(id);
		if (artikel == null) {
			throw new NotFoundException("Kein Artikel mit der ID " + id + " gefunden.");
		}
				
		// Link-Header setzen
		final Response response = Response.ok(artikel)
                                          .links(getTransitionalLinks(artikel, uriInfo))
                                          .build();
		return response;
	}
		
	private Link[] getTransitionalLinks(Artikel artikel, UriInfo uriInfo) {
		final Link self = Link.fromUri(getUriArtikel(artikel, uriInfo))
                              .rel(SELF_LINK)
                              .build();
		return new Link[] { self };
	}
	
	public URI getUriArtikel(Artikel artikel, UriInfo uriInfo) {
		return uriHelper.getUri(ArtikelResource.class, "findArtikelById", artikel.getId(), uriInfo);
	}
	
	@POST
	@Consumes({APPLICATION_JSON, APPLICATION_XML, TEXT_XML })
	@Produces
	public Response createArtikel(Artikel artikel) {
		artikel = Mock.createArtikel(artikel);
		return Response.created(getUriArtikel(artikel, uriInfo))
			           .build();
	}
	
	@PUT
	@Consumes({APPLICATION_JSON, APPLICATION_XML, TEXT_XML })
	@Produces
	public void updateArtikel(Artikel artikel) {
		// TODO Anwendungskern statt Mock, Verwendung von Locale
		Mock.createArtikel(artikel);
	}
}
