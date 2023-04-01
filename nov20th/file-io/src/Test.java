import java.io.*;
class Test implements Serializable
{
	private static final long serialVersionUID = 8333955202500434284L;
	
	int i;
	int j;
	int k;

}


/*
-Every servlet is Serilaizable.
-two classes will not have same serial version uid.
-if class is a type of Serializable,compiler checks wheter programmer providing serialversionUid or not

-while serialzig  whatever object data is there writing into filesystem.
-How Serialization framework identify version compartibility

G:\nov20th\file-io\classes>serialver Test
Test:    private static final long serialVersionUID = -8733344177675629280L;

-serialver is used to identify serialversion uid


modify Test.java
G:\nov20th\file-io\src>javac -d ../classes Test.java

G:\nov20th\file-io\src>cd ../classes

G:\nov20th\file-io\classes>serialver Test
Test:    private static final long serialVersionUID = 8333955202500434284L;


-serialversionUId changed.


-for every small modifacation serialversionUID changes
-serialversionUID is a long number.
-if class is a type of serializable compiler generate a serilalversionUid compiler
generating a serialversion UID ,it is a long number.
-Serilal bversion uid is constant,autometically genegated.
-two classes will not have same SerialversionUID.
-Whenever serializing Object,not only object members but also 
Serial version uid also writing into file system'
-While Deseializing it is getting serial version Uid comparing if matches success.
-while deserializing if class is changed deserialization can not be success.




G:\nov20th\file-io\src>java -cp ../classes Z24
100
100

G:\nov20th\file-io\src>javac -d ../classes Test.java

G:\nov20th\file-io\src>java -cp ../classes Z24
java.io.InvalidClassException: Test; local class incompatible: stream classdesc serialVersionUID = -4439017844766313183, local class serialVersionUID = -8733344177675629280
        at java.io.ObjectStreamClass.initNonProxy(ObjectStreamClass.java:687)
        at java.io.ObjectInputStream.readNonProxyDesc(ObjectInputStream.java:1880)
        at java.io.ObjectInputStream.readClassDesc(ObjectInputStream.java:1746)
        at java.io.ObjectInputStream.readOrdinaryObject(ObjectInputStream.java:2037)
        at java.io.ObjectInputStream.readObject0(ObjectInputStream.java:1568)
        at java.io.ObjectInputStream
*/