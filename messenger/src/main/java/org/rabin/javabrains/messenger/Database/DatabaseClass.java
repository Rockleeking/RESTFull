/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rabin.javabrains.messenger.Database;

import java.util.HashMap;
import java.util.Map;
import org.rabin.javabrains.messenger.Entity.Post;
import org.rabin.javabrains.messenger.Entity.Profile;


public class DatabaseClass {

    private static Map<Long,Post> posts = new HashMap<>();
    private static Map<String,Profile> profiles = new HashMap<>();

    public static Map<Long,Post> getPosts() {
        return posts;
    }

    public static Map<String,Profile> getProfiles() {
        return profiles;
    }
    
    
}
