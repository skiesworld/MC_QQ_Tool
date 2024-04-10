package com.github.theword.eventModels.base;


public class BaseNoticeEvent extends BaseEvent {
    private final BasePlayer player;

    public BaseNoticeEvent(String eventName, String subType, BasePlayer player) {
        super(eventName, "notice", subType);
        this.player = player;
    }

}
