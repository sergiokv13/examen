package examen;
import java.io.*;
import java.util.*;

public class anho{

	boolean verificarDivisibles(int x,int y){
		return (x % y == 0);
	}

	boolean anhoBisiesto (int anho){
		if ( verificarDivisibles(anho,4) ){
			if (verificarDivisibles (anho,100) && !verificarDivisibles(anho,400))
				return false;
			return true;
		}
		return false;
	}
	
}
