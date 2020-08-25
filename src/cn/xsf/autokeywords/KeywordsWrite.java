package cn.xsf.autokeywords;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class KeywordsWrite {
    public static void main(String args[]) {
        List<String> Other = new ArrayList<>();
        Other.add("300K");
        Other.add("120K");
        Other.add("32K");
        Other.add("19K");
        Other.add("combo");
        Other.add("keywords");
        Other.add("hypixel");
        Other.add("hive");
        Other.add("level");
        Other.add("HQ");
        Other.add("2b2t");
        Other.add("and");
        Other.add("10k");
        Other.add("skyblock");
        Other.add("bedwars");
        Other.add("minecraft");
        Other.add("skywars");
        Other.add("pot");
        Other.add("is");
        Other.add("are");
        Other.add("good");
        Other.add("@gamil.com ");
        Other.add("@outlook.com ");
        Other.add("Ranked");
        Random randomO = new Random();
        int OT = randomO.nextInt(Other.size());

        String O = Other.get(OT);


        List<String> Mail = new ArrayList<>();
        Mail.add("@outlook.com");
        Mail.add("@alicedsl.com");
        Mail.add("@caramail.com");
        Mail.add("@gmx.com");
        Mail.add("@yahoo.com");
        Mail.add("@hotmailcom");
        Mail.add("@gmail.com");
        Random randomMCOM = new Random();
        int Mcon = randomMCOM.nextInt(Other.size());
        String M = Other.get(Mcon);

        List<String> FA = new ArrayList<>();
        FA.add("VIP");
        FA.add("VIP+");
        FA.add("MVP");
        FA.add("MVP+");
        FA.add("MVP++");
        Random rMailcom = new Random();
        int BK = rMailcom.nextInt(FA.size());

        String F = FA.get(BK);


        List<String> Rank = new ArrayList<>();
        Rank.add("SFA");
        Rank.add("NFA");
        Rank.add("MFA");
        Rank.add("UFA");
        Rank.add("FAF");
        Random randomR = new Random();
        int rank = randomR.nextInt(Rank.size());

        String R = Rank.get(rank);




        try {
            File writeName = new File("C:\\keywords.txt");
            writeName.createNewFile();
            try (FileWriter writer = new FileWriter(writeName);
                 BufferedWriter out = new BufferedWriter(writer)
            ) {
                out.write("@outlook"+"\t"+O+" "+F+" "+R+" "+ "Minecraft\r\n");

                out.write("@outlook"+"\t"+O+" "+R+" "+F+" "+ "Minecraft\r\n");

                out.write("@outlook"+"\t"+R+" "+O+" "+F+" "+ "Minecraft\r\n");

                out.write("@outlook"+"\t"+R+" "+F+" "+O+" "+ "Minecraft\r\n");

                out.write("@outlook"+"\t"+F+" "+O+" "+R+" "+ "Minecraft\r\n");

                out.write("@outlook"+"\t"+F+" "+R+" "+O+" "+ "Minecraft\r\n");

                out.write("@outlook"+"\t"+O+" "+F+" "+R+" "+M+" "+"Minecraft\r\n");

                out.write("@outlook"+"\t"+F+" "+R+" "+O+" "+ "Minecraft\r\n");

                out.write("@outlook"+"\t"+O+" "+R+" "+F+" "+ "Minecraft\r\n");

                out.write("@outlook"+"\t"+R+" "+O+" "+F+" "+ "Minecraft\r\n");

                out.write("@outlook"+"\t"+R+" "+F+" "+O+" "+ "Minecraft\r\n");

                out.write("@outlook"+"\t"+F+" "+O+" "+R+" "+ "Minecraft\r\n");

                out.write("@outlook"+"\t"+F+" "+R+" "+O+" "+ "Minecraft\r\n");

                out.write("@outlook"+"\t"+O+" "+F+" "+R+" "+M+" "+"Minecraft\r\n");

                out.flush();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


