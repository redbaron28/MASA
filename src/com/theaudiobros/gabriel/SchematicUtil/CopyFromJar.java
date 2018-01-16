package com.theaudiobros.gabriel.SchematicUtil;

import java.io.*;

public class CopyFromJar {

    public static void copy(String source,String dest) throws IOException{
        try{
            File sourceFile = new File(source);
            File destFile = new File(dest);
            InputStream in = CopyFromJar.class.getResourceAsStream(source);
            OutputStream out = new FileOutputStream(destFile);
            int bufferSize = 1024;
            byte[] buf = new byte[bufferSize];
            int len;
            while ((len = in.read(buf)) > 0){
                out.write(buf,0,len);
            }
            in.close();
            out.close();
        }
        catch(IOException e){
            throw e;
        }
    }

}
