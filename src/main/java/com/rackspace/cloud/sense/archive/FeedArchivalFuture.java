/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rackspace.cloud.sense.archive;

/**
 *
 * @author zinic
 */
public interface FeedArchivalFuture {

    void onCompletion(FeedArchivalFutureListener f);

    boolean hasCompletionCallback();
    
    FeedArchivalFutureListener completionCallback();
}
