package com.au;

import java.io.PrintStream;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.lang.WordUtils;

public final class HelloConsole {
    public static void main(String[] var0) {

        try {
            HelloConsoleOutput(var0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String HelloConsoleOutput(String[] var0) throws Exception {
        Option var1 = Option.builder("m").longOpt("message").hasArg().desc("the message to capitalize").build();
        Options var2 = new Options();
        var2.addOption(var1);
        DefaultParser var3 = new DefaultParser();
        CommandLine var4 = var3.parse(var2, var0);
        String var5 = var4.getOptionValue("m", "hello ivy!");
        System.out.println("standard message : " + var5);
        PrintStream var10000 = System.out;
        String var10001 = WordUtils.class.getName();
        var10000.println("capitalized by " + var10001 + " : " + WordUtils.capitalizeFully(var5));

        return WordUtils.capitalizeFully(var5);
    }
}
