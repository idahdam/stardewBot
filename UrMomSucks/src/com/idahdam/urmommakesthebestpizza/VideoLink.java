package com.idahdam.urmommakesthebestpizza;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;

public class VideoLink {
    ArrayList<String> goodLink = new ArrayList<>();
    ArrayList<String> badLink = new ArrayList<>();

    MongoClient mongo = new MongoClient( "localhost" , 27017 );
    MongoDatabase database = mongo.getDatabase("VideosCollection");
    MongoCollection<Document> collection = database.getCollection("badVideos");
    MongoCollection<Document> collection2 = database.getCollection("goodVideos");

    MongoCredential credential = MongoCredential.createCredential("admin", "VideosCollection",
            "admin".toCharArray());

    public void setBadLink(){
        FindIterable<Document> iterDoc = collection.find();

        try{
            for(Document document : iterDoc){
//                System.out.println(document.get("link") + "\n");
                badLink.add((String) document.get("link"));
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }

    }

    public String getBadLink() {
        return badLink.get(((int) (Math.random() * badLink.size())));
    }

    public void setGoodLink(){
        FindIterable<Document> iterDoc = collection2.find();

        try{
            for(Document document : iterDoc){
//                System.out.println(document.get("link") + "\n");
                goodLink.add((String) document.get("link"));
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }

    }

    public String getGoodLink() {
        return goodLink.get((int) (Math.random()*goodLink.size()));
    }
}
