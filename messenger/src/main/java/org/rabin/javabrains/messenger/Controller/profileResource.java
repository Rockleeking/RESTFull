package org.rabin.javabrains.messenger.Controller;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.rabin.javabrains.messenger.Entity.Profile;
import org.rabin.javabrains.messenger.Service.profileService;

@Path("/profiles")
public class profileResource {
    private profileService prs = new profileService();
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Profile> getProfiles(){
        return prs.getAllProfiles();
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)
    public Profile addProfile(Profile profile){
       return prs.addProfile(profile);
    }
    @GET
    @Path("/{profileName}")
    @Produces(MediaType.APPLICATION_XML)
    public Profile getProfile(@PathParam("profileName") String ProfileName){
        return prs.getProfile(ProfileName);
    }
    
    @PUT
    @Path("/{profileName}")
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)
    public Profile updateProfile(@PathParam("profileName") String ProfileName, Profile profile){
      profile.setProfileName(ProfileName);
      return prs.updateProfile(profile);
    }
    
    @DELETE
    @Path("/{profileName}")
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)  
    public void delete(@PathParam("profileName") String ProfileName){
        prs.removeProfile(ProfileName);
    }
}
