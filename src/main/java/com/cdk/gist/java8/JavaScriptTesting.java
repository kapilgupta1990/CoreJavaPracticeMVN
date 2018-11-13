package com.cdk.gist.java8;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JavaScriptTesting {

	public static void main(String[] args) throws ScriptException {

		ScriptEngine scriptEngine=new ScriptEngineManager().getEngineByName("nashorn");
		scriptEngine.eval("print('Hello World!');");
		//scriptEngine.eval("alert('kapil');");

	}
}
