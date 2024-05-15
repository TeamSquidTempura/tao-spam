package com.squidtempura;


import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import static com.squidtempura.Main.channel;
import static com.squidtempura.Main.user;

public class message extends ListenerAdapter {
    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent ev){
        if (user.isEmpty() && ev.getMessage().getContentRaw().equals("!autoTAO")){
            user = ev.getAuthor().getName();
            ev.getMessage().reply("自動タオを開始します。").queue();
            Main.channel = ev.getChannel().getIdLong();
            Main.attack();
        }
        if (channel == 0) return;
        if (channel == ev.getChannel().getIdLong() && ev.getMessage().getContentRaw().contains("※戦いをやり直すには『::reset』")){
            try {
                Thread.sleep(3000);
                Main.reset();
                ev.getChannel().sendMessage("::resetを実行しました").mentionRepliedUser(false).queue();
                Thread.sleep(3000);
                Main.attack();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } else {
            if (user.equals(ev.getAuthor().getName()) && ev.getMessage().getContentRaw().equals("::atk")){
                ev.getMessage().reply("アタックを検知したので次のアタックをします。").mentionRepliedUser(false).queue();
                try {
                    Thread.sleep(3000);
                    Main.attack();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
