/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import org.rabin.javabrains.messenger.Entity.Post;
import org.rabin.javabrains.messenger.Service.postService;

@Path("/posts")
public class postResource {
    postService ps = new postService();
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Post> getPosts(){

        
        return ps. getAllPosts();
    }
    
    @POST
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public Post addPost(Post post){
    return ps.addPost(post);
    }
    
    
    @PUT
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public Post updatePost(@PathParam("id")long id, Post post){
        post.setId(id);
    return ps.updatePost(post);
    }
    
    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public void deletePost(@PathParam("id")long id){
        ps.removePost(id);
    }
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_XML)
    public Post getPost(@PathParam("id") long id){
    return ps.getPosts(id);
    }
}
