package com.amazonaws.event;

import java.util.concurrent.Executor;

/**
 * Created by: joshng 11/9/13 11:24 AM
 */
public interface ProgressListenerWithExecutor extends ProgressListener {
  Executor getExecutor();
}
