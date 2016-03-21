package com.eason.btrace;

import static com.sun.btrace.BTraceUtils.*;

import com.sun.btrace.annotations.*;

@BTrace
public class BtraceScript {

	@TLS
	private static long startTime = 0;

	@OnMethod(clazz = "com.eason.Counter", method = "inc", location = @Location(Kind.ENTRY))
	public static void start() {
		startTime = timeMillis();
	}

	@OnMethod(clazz = "com.eason.Counter", method = "inc", location = @Location(Kind.RETURN))
	public static void end() {
		long time = timeMillis() - startTime;
		println(concat("inc cost", str(time)));
	}
}
