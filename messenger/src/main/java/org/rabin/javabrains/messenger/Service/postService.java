/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rabin.javabrains.messenger.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.rabin.javabrains.messenger.Database.DatabaseClass;
import org.rabin.javabrains.messenger.Entity.Post;


public class postService {
    private Map<Long,Post> posts = DatabaseClass.getPosts();
    
    public postService(){
       posts.put(1L, new Post(1, "Hello world", "Rocklee"));
       posts.put(2L, new Post(2, "Hello Jersey", "Rocklee"));
    }
    
   public List<Post> getAllPosts(){
//       Post p1 = new Post(1L, "Hello world", "Rabin");
//       Post p2   = new Post(2L, "Hello Jersey", "Rabin");
//       List<Post> list= new ArrayList<>();
//       list.add(p1);
//       list.add(p2);
//       return list;

        return new ArrayList<Post>(posts.values());
   }
   
   public Post getPosts(long id) {
        return posts.get(id);
    }
   
   public Post addPost(Post post){
       post.setId(posts.size() + 1);
       post.setCreated( new Date());
       posts.put(post.getId(), post);
       return post;
   }
   
   public Post updatePost(Post post){
       if(post.getId()<=0){
           return null;
       }
       posts.put(post.getId(), post);
       return post;
   }
   
   public Post removePost(long id){
      return posts.remove(id);
   }
   
}
