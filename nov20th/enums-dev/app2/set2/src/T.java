interface R
{
	void test1();
}
abstract enum T implements R
{

	;
}

/*
abstract is not allowed here
-if enums supprting inheristance then abstarct
-enum can not be an abstract as it is not supporting inheristance.
-Inheriting super class member to subclass.
- enums are only for encapsulation --- no abstaction --no polymorphism--no inheristace
-enums are only for fixed number of simlar kind of elements
*/