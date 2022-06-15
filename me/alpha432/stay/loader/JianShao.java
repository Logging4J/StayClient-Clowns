//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.loader;

import javax.imageio.*;
import java.util.*;
import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.net.*;
import java.awt.event.*;

public class JianShao
{
    private static JFrame frame;
    private static String version;
    
    public static void main(final String[] args) {
        try {
            final String URLS = "http://47.106.126.97/mc/";
            (JianShao.frame = new JFrame("STAY Loader Interface")).setDefaultCloseOperation(3);
            JianShao.frame.setSize(616, 372);
            JianShao.frame.setIconImage(ImageIO.read(new URL(URLS + "Stay.png")));
            final Container con = JianShao.frame.getContentPane();
            JianShao.frame.setLocationRelativeTo(null);
            JianShao.frame.setResizable(false);
            JianShao.frame.setVisible(true);
            final JButton stableButton = new JButton();
            final JButton betaButton = new JButton();
            final Random rand = new Random();
            stableButton.setOpaque(true);
            stableButton.setContentAreaFilled(false);
            stableButton.setBorderPainted(true);
            betaButton.setOpaque(true);
            betaButton.setContentAreaFilled(false);
            betaButton.setBorderPainted(true);
            stableButton.setToolTipText("Click to get information about stay");
            betaButton.setToolTipText("Click to check whether the loader is the latest version");
            final JLabel backgroundPane = new JLabel(new ImageIcon(ImageIO.read(new URL(URLS + rand.nextInt(4) + ".jpg"))));
            final JLabel betaButtonIcon = new JLabel(new ImageIcon(ImageIO.read(new URL(URLS + "beta.png"))));
            final JLabel stayIcon = new JLabel(new ImageIcon(ImageIO.read(new URL(URLS + "stayhudlog.png"))));
            final JLabel Icon = new JLabel(new ImageIcon(ImageIO.read(new URL(URLS + "Stay.png"))));
            final JLabel stableButtonIcon = new JLabel(new ImageIcon(ImageIO.read(new URL(URLS + "stable.png"))));
            final JLabel breadIcon = new JLabel(new ImageIcon(ImageIO.read(new URL(URLS + "bread.png"))));
            con.add(stableButton);
            con.add(betaButton);
            con.add(betaButtonIcon);
            con.add(stayIcon);
            con.add(Icon);
            con.add(stableButtonIcon);
            final int bread = rand.nextInt(50);
            if (bread == 1) {
                con.add(breadIcon);
            }
            con.add(backgroundPane);
            breadIcon.setBounds(200, 150, 128, 128);
            stableButtonIcon.setBounds(90, 245, 200, 50);
            stableButton.setBounds(90, 245, 200, 50);
            betaButtonIcon.setBounds(310, 245, 200, 50);
            betaButton.setBounds(310, 245, 200, 50);
            stayIcon.setBounds(236, 70, 128, 128);
            Icon.setBounds(30, 30, 32, 32);
            backgroundPane.setBounds(0, 0, 600, 355);
            betaButton.addActionListener(e -> getFileContent("http://47.106.126.97/loader/bend.txt"));
            stableButton.addActionListener(e -> JOptionPane.showConfirmDialog(JianShao.frame, "Stay is the main development of CC, but bot, six and Moxi are also involved in the development\r\nThis end uses Zori's framework and kamiblue's installer source code\r\nContact information #cuican", "About stay by: CC", 0));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private static void getFileContent(final String fileUrl) {
        BufferedReader bf = null;
        String line = "";
        String result = "";
        try {
            final URL url = new URL(fileUrl);
            final URLConnection conn = url.openConnection();
            conn.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
            conn.connect();
            final HttpURLConnection urlConn = (HttpURLConnection)conn;
            if (urlConn.getResponseCode() == 200) {
                bf = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
                while ((line = bf.readLine()) != null) {
                    result += line;
                }
                if (Double.valueOf(JianShao.version).equals(Double.valueOf(result))) {
                    JOptionPane.showConfirmDialog(JianShao.frame, "Check succeeded. Your stay loader is the latest version:" + result, "Connection status: successful", 0);
                }
                else {
                    final int and = JOptionPane.showConfirmDialog(JianShao.frame, "Check succeeded. Your stay loader is not the latest version.\r\n Your version:" + JianShao.version + "  Latest version:" + result + "\r\nUpdate?", "Connection status: successful", 0);
                    if (and == 0) {
                        URI uri = null;
                        try {
                            uri = new URI("http://47.106.126.97/loader/Stay-" + result + "-loader-obf.jar");
                        }
                        catch (URISyntaxException e) {
                            e.printStackTrace();
                        }
                        Desktop.getDesktop().browse(uri);
                    }
                }
            }
            else {
                JOptionPane.showConfirmDialog(JianShao.frame, "Failed to connect to the server! overtime", "Unable to link to URL", 0);
                System.out.println("Unable to link to URL!");
            }
        }
        catch (MalformedURLException e2) {
            e2.printStackTrace();
        }
        catch (IOException e3) {
            e3.printStackTrace();
        }
        finally {
            try {
                if (bf != null) {
                    bf.close();
                }
            }
            catch (IOException e4) {
                e4.printStackTrace();
            }
        }
    }
    
    static {
        JianShao.frame = new JFrame();
        JianShao.version = "0.22";
    }
}
