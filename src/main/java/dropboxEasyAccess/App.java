
package dropboxEasyAccess;

import com.dropbox.core.*;
import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class App {
	final static String APP_KEY = "qpbbifnoarri3th";
    final static String APP_SECRET = "r10uuvwg2c937lj";
	final static String USR_TOKEN = "aC-EdBEmBxgAAAAAAABa0qFZGAWz1OmzSDg_ppj8tPRXgRozOi0cvF5kkjHgdsQ8";
	final static String TARGET = "/public";
	
    public static void main(String[] args) throws IOException, DbxException {

////Authentication    	
        // Get your app key and secret from the Dropbox developers website.
        DbxAppInfo appInfo = new DbxAppInfo(APP_KEY, APP_SECRET);

        DbxRequestConfig config = new DbxRequestConfig(
            "JavaTutorial/1.0", Locale.getDefault().toString());
        DbxWebAuthNoRedirect webAuth = new DbxWebAuthNoRedirect(config, appInfo);
        
        DbxClient client = new DbxClient(config, USR_TOKEN);
        
//////Uploading files
//        File inputFile = new File("~/working-draft.txt");
//        FileInputStream inputStream = new FileInputStream(inputFile);
//        try {
//            DbxEntry.File uploadedFile = client.uploadFile("/magnum-opus.txt",
//                DbxWriteMode.add(), inputFile.length(), inputStream);
//            System.out.println("Uploaded: " + uploadedFile.toString());
//        } finally {
//            inputStream.close();
//        }
//        
////Listing folders
        DbxEntry.WithChildren listing = client.getMetadataWithChildren(TARGET);
        System.out.println("Files in "+TARGET);
        for (DbxEntry child : listing.children) {
        	System.out.println("\t" + child.name + ":\n\t\t" + child.toString());
        }        
//////Downloading files
//        FileOutputStream outputStream = new FileOutputStream("magnum-opus.txt");
//        try {
//            DbxEntry.File downloadedFile = client.getFile("/magnum-opus.txt", null,
//                outputStream);
//            System.out.println("Metadata: " + downloadedFile.toString());
//        } finally {
//            outputStream.close();
//        }
        
    }
}
        
        