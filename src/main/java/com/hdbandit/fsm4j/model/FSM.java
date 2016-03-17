package com.hdbandit.fsm4j.model;

public interface FSM <E, S> {
    
    void sendEvent(E event);
    
    S getStatus();

}
