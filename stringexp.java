import java.io.BufferedInputStream;
import java.io.*;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;

public class stringexp {
    public static void main(String[] args) {

        String f="fun";
        for (int i=0;i<f.length();i++){
            for (int j=i+1;j<f.length()+1;j++){
                System.out.println(f.substring(i,j));
            }
        }





    }
}
