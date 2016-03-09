//
//package dropboxEasyAccess;
//
//import com.dropbox.core.*;
//import java.io.*;
//import java.util.Locale;
//
//public class Authentication {
//	final static String codeDataFilename = "";
//    public static void main(String[] args) throws IOException, DbxException {
//
//////Authentication    	
//        // Get your app key and secret from the Dropbox developers website.
//        final String APP_KEY = "qpbbifnoarri3th";
//        final String APP_SECRET = "r10uuvwg2c937lj";
//
//        DbxAppInfo appInfo = new DbxAppInfo(APP_KEY, APP_SECRET);
//
//        DbxRequestConfig config = new DbxRequestConfig(
//            "JavaTutorial/1.0", Locale.getDefault().toString());
//        DbxWebAuthNoRedirect webAuth = new DbxWebAuthNoRedirect(config, appInfo);
//
//        // Have the user sign in and authorize your app.
//        String authorizeUrl = webAuth.start();
//        System.out.println("1. Go to: " + authorizeUrl);
//        System.out.println("2. Click \"Allow\" (you might have to log in first)");
//        System.out.println("3. Copy the authorization code.");
//        String code = new BufferedReader(new InputStreamReader(System.in)).readLine().trim();
//        
//        File codeDataFile = new File(codeDataFileName);
//        
//        DbxAuthFinish authFinish = webAuth.finish(code);
//        String accessToken = authFinish.accessToken;
//        
//        DbxClient client = new DbxClient(config, accessToken);
//        System.out.println("Linked account: " + client.getAccountInfo().displayName);
//    }
//}