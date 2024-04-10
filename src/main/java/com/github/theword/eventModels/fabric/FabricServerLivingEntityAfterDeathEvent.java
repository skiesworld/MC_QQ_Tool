package com.github.theword.eventModels.fabric;

import com.github.theword.eventModels.base.BasePlayerDeathEvent;

public class FabricServerLivingEntityAfterDeathEvent extends BasePlayerDeathEvent {

    public FabricServerLivingEntityAfterDeathEvent(String messageId, FabricServerPlayer player, String message) {
        super("ServerLivingEntityAfterDeathEvent", messageId, player, message);
    }
}
