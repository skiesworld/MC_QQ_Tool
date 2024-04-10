package com.github.theword.eventModels.forge;

import com.github.theword.eventModels.base.BasePlayerChatEvent;

public final class ForgeServerChatEvent extends BasePlayerChatEvent {
    public ForgeServerChatEvent(String messageId, ForgeServerPlayer player, String message) {
        super("ForgeServerChatEvent", messageId, player, message);
    }

}