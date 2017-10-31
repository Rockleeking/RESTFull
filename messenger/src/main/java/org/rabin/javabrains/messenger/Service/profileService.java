/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rabin.javabrains.messenger.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.rabin.javabrains.messenger.Database.DatabaseClass;
import org.rabin.javabrains.messenger.Entity.Profile;



public class profileService {
    private Map<String,Profile> profiles = DatabaseClass.getProfiles();
    
    public profileService(){
        Profile p1= new Profile(1L, "Rocklee", "Rabin", "Khadka");
        profiles.put("RockleeKing", p1);
       Profile p2 =  new Profile(2L, "RockleeKing", "Rabin", "Khadka");
        profiles.put("Rocklee",p2);
    }
    
    public List<Profile> getAllProfiles(){
    
        return new ArrayList<Profile>(profiles.values());
    }
    
    public Profile getProfile(String profileName){
        return profiles.get(profileName);
    }
    
    public Profile updateProfile(Profile profile){
        if(profile.getProfileName().isEmpty()){
            return null;
        }
        profiles.put(profile.getProfileName(), profile);
        return profile;
    }
    
    public Profile addProfile(Profile profile){
    
        profile.setId(profiles.size() + 1);
        profile.setCreated(new Date());
        profiles.put(profile.getProfileName(), profile);
        return profile;
    }
    
    public Profile removeProfile(String ProfileName){
        return profiles.remove(ProfileName);
         
    }
}
