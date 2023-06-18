SET CLASSPATH=.;C:\antlr4\lib\antlr-4.10.1-complete.jar;%CLASSPATH%
SET PATH=C:\Program Files\AdoptOpenJDK\jdk-11.0.4.11-hotspot\bin;%PATH%
doskey antlr4=java org.antlr.v4.Tool $*
doskey grun =java org.antlr.v4.gui.TestRig $*
