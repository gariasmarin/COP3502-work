package com.jetbrains;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class NumericConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        while(true){
            System.out.println("Decoding Menu");
            System.out.println("-------------");
            System.out.println("1. Decode hexadecimal");
            System.out.println("2. Decode binary");
            System.out.println("3. Convert binary to hexadecimal");
            System.out.println("4. Quit\n");
            System.out.println("Please enter an option: ");
            a = scanner.nextInt();
            switch(a) {
                case 1:
                    String s;
                    System.out.println("Please enter the numeric string to convert: ");
                    s = scanner.next();
                    if(s.length() > 1) {
                        System.out.println("Result: " + hexStringDecode(s));
                    }
                    else{
                        System.out.println("Result: " + hexCharDecode(s.charAt(0)));
                    }
                    break;
                case 2:
                    String b;
                    System.out.println("Please enter the numeric string to convert: ");
                    b = scanner.next();
                    System.out.println("Result: " + binaryStringDecode(b));
                    break;
                case 3:
                    String h;
                    System.out.println("Please enter the numeric string to convert: ");
                    h = scanner.next();
                    System.out.println("Result: " + binaryToHex(h));
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    return;
            }

        }
    }

    public static Long hexStringDecode(String hex){
        long sum = 0;
        long total = 0;
        for (int i = hex.length()-1; i >= 0; --i){
            if(hex.charAt(i) == 0)
            {
                sum += 0;
            }
            else if(hex.charAt(i) == 'x')
            {
                sum += 0;
            }
            else if(hex.charAt(i) == '1')
            {
                sum += 1;
            }
            else if(hex.charAt(i) == '2')
            {
                sum +=2 ;
            }
            else if(hex.charAt(i) == '3')
            {
                sum += 3;
            }
            else if(hex.charAt(i) == '4')
            {
                sum += 4;
            }
            else if(hex.charAt(i) == '5')
            {
                sum +=5 ;
            }
            else if(hex.charAt(i) == '6')
            {
                sum += 6;
            }
            else if(hex.charAt(i) == '7')
            {
                sum += 7;
            }
            else if(hex.charAt(i) == '8')
            {
                sum += 8;
            }
            else if(hex.charAt(i) == '9')
            {
                sum +=9 ;
            }
            else if(hex.charAt(i) == 'A')
            {
                sum += 10;
            }
            else if(hex.charAt(i) == 'a')
            {
                sum += 10;
            }
            else if(hex.charAt(i) == 'B')
            {
                sum += 11;
            }
            else if(hex.charAt(i) == 'b')
            {
                sum += 11;
            }
            else if(hex.charAt(i) == 'C')
            {
                sum +=12 ;
            }
            else if(hex.charAt(i) == 'c')
            {
                sum += 12;
            }
            else if(hex.charAt(i) == 'D')
            {
                sum += 13;
            }
            else if(hex.charAt(i) == 'd')
            {
                sum +=13 ;
            }
            else if(hex.charAt(i) == 'E')
            {
                sum +=14 ;
            }
            else if(hex.charAt(i) == 'e')
            {
                sum += 14;
            }
            else if(hex.charAt(i) == 'F')
            {
                sum += 15;
            }
            else if(hex.charAt(i) == 'f')
            {
                sum += 15;
            }
            int x = (hex.length()-1)-i;
            int hexV = (int) Math.pow(16,x);
            sum *= hexV;
            total += sum;
            sum = 0;
        }
        return total;
    }
    public static short hexCharDecode(char digit){
        short sum = 0;
        if (digit == 0)
        {
            sum = 0;
        }
        else if (digit == 1 )
        {
            sum =1 ;
        }
        else if (digit ==2 )
        {
            sum = 2;
        }
        else if (digit == 3)
        {
            sum =3 ;
        }
        else if (digit ==4 )
        {
            sum = 4;
        }
        else if (digit == 5)
        {
            sum = 5;
        }
        else if (digit == 6)
        {
            sum =6 ;
        }
        else if (digit == 7)
        {
            sum =7 ;
        }
        else if (digit ==8 )
        {
            sum =8 ;
        }
        else if (digit ==9 )
        {
            sum = 9;
        }
        else if (digit == 'A')
        {
            sum =10 ;
        }
        else if (digit =='a' )
        {
            sum =10 ;
        }
        else if (digit == 'B')
        {
            sum = 11;
        }
        else if (digit == 'b')
        {
            sum = 11;
        }
        else if (digit == 'C')
        {
            sum =12 ;
        }
        else if (digit == 'c')
        {
            sum = 12;
        }
        else if (digit =='D' )
        {
            sum = 13;
        }
        else if (digit == 'd')
        {
            sum =13 ;
        }
        else if (digit == 'E')
        {
            sum =14 ;
        }
        else if (digit == 'e')
        {
            sum = 14;
        }
        else if (digit =='F' )
        {
            sum = 15;
        }
        else if (digit =='f' )
        {
            sum = 15;
        }
        return sum;
    }
    public static short binaryStringDecode(String binary){
        short total = 0;
        short sum = 0;
        for (int i = binary.length()-1; i >= 0; --i){
            if (binary.charAt(i) == '0')
            {
                sum += 0;
            }
            else if (binary.charAt(i) == '1')
            {
                sum += 1;
            }
            else if (binary.charAt(i) == 'b')
            {
                sum += 0;
            }
            int x = (binary.length()-1)-i;
            int binV = (int) Math.pow(2,x);
            sum *= binV;
            total += sum;
            sum = 0;
        }
        return total;
    }
    public static String binaryToHex (String binary){
        char h = 0;
        String p = null;
        int remainder;
        char[] hex = new char[20];
        int b = binaryStringDecode(binary);
        int i = 0;
        while (b!=0)
        {
            remainder = b % 16;
            if (remainder < 10)
            {
                hex[i] = (char)(remainder + 48);
                i++;
            }
            else{
                hex[i] = (char)(remainder + 55);
                i++;
            }
            b = b/16;
        }
        for (int j = i-1; j>=0; j--){
            h = hex[j];
            p = String.valueOf(h);
        }
        p = String.valueOf(h);
        return p;
    }







}

