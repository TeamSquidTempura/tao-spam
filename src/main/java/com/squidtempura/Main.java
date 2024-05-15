package com.squidtempura;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Main {
    public static String user = "";
    public static long channel = 0;

    public static JDA jda;

    public static void main(String[] args) {
        jda = JDABuilder.createDefault("token")
                .enableIntents(GatewayIntent.GUILD_MESSAGES, GatewayIntent.GUILD_MESSAGE_REACTIONS, GatewayIntent.MESSAGE_CONTENT)
                .addEventListeners(new message())
                .setActivity(Activity.watching("TAOスパムBOT"))
                .build();
    }
    public static void attack(){
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_COLON);
            robot.keyRelease(KeyEvent.VK_COLON);
            robot.keyPress(KeyEvent.VK_COLON);
            robot.keyRelease(KeyEvent.VK_COLON);
            robot.keyPress(KeyEvent.VK_A);
            robot.keyRelease(KeyEvent.VK_A);
            robot.keyPress(KeyEvent.VK_T);
            robot.keyRelease(KeyEvent.VK_T);
            robot.keyPress(KeyEvent.VK_K);
            robot.keyRelease(KeyEvent.VK_K);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
    }
    public static void reset(){
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_COLON);
            robot.keyRelease(KeyEvent.VK_COLON);
            robot.keyPress(KeyEvent.VK_COLON);
            robot.keyRelease(KeyEvent.VK_COLON);
            robot.keyPress(KeyEvent.VK_R);
            robot.keyRelease(KeyEvent.VK_R);
            robot.keyPress(KeyEvent.VK_E);
            robot.keyRelease(KeyEvent.VK_E);
            robot.keyPress(KeyEvent.VK_S);
            robot.keyRelease(KeyEvent.VK_S);
            robot.keyPress(KeyEvent.VK_E);
            robot.keyRelease(KeyEvent.VK_E);
            robot.keyPress(KeyEvent.VK_T);
            robot.keyRelease(KeyEvent.VK_T);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
    }
}