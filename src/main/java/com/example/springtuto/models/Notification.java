package com.example.springtuto.models;




public class Notification {
   
    private String flutterAppID;
    
    private String flutterAppToken;
    private String title;
    private String body;
    private String bigPictureURL;
    public Notification( ){}
    public Notification( String _flutterAppID,String _flutterAppToken ,String _title, String _body, String _bigPictureURL){
        flutterAppID=_flutterAppID;
     flutterAppToken=_flutterAppToken;
     title=_title;
     body=_body;
     bigPictureURL=_bigPictureURL;

    }
}
