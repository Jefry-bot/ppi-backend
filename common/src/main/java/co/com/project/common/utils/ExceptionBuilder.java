package co.com.project.common.utils;

import co.com.project.common.dtos.ExceptionBody;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ExceptionBuilder {

    public ExceptionBody build(Throwable exception) {
        StackTraceElement trace = exception.getStackTrace()[0];

        return ExceptionBody
                    .init()
                        .clazz(trace.getClassName())
                        .filename(trace.getFileName())
                        .message(exception.getMessage())
                        .line(trace.getLineNumber())
                        .localizedMessage(exception.getLocalizedMessage())
                        .method(trace.getMethodName())
                    .build();
    }
}
