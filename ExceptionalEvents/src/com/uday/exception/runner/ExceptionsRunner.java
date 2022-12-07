package com.uday.exception.runner;


import java.awt.color.CMMException;
import java.io.EOFException;
import java.nio.channels.AcceptPendingException;
import java.nio.channels.AlreadyBoundException;
import java.rmi.activation.ActivationException;
import java.security.acl.AclNotFoundException;
import java.security.cert.CRLException;
import java.util.jar.JarException;

import javax.activity.InvalidActivityException;
import javax.management.BadBinaryOpValueExpException;
import javax.management.InvalidAttributeValueException;
import javax.naming.LinkException;
import javax.naming.directory.AttributeModificationException;
import javax.xml.bind.DataBindingException;

import org.omg.CORBA.portable.ApplicationException;

import com.sun.activation.registries.MailcapParseException;
import com.sun.jmx.snmp.BerException;
import com.sun.media.sound.InvalidFormatException;
import com.sun.org.apache.xerces.internal.dom.AbortException;
import com.sun.org.apache.xerces.internal.impl.dv.DatatypeException;
import com.sun.org.apache.xml.internal.resolver.CatalogException;
import com.sun.xml.internal.org.jvnet.mimepull.DecodingException;
import com.uday.exception.exceptionalEvents.ExceptionalEvents;

import sun.awt.image.BadDepthException;
import sun.misc.CEFormatException;

public class ExceptionsRunner  {

	public static void main(String[] args) throws Exception,AclNotFoundException,
	ActivationException,AlreadyBoundException,ApplicationException,BadDepthException,
	BadBinaryOpValueExpException,BadBinaryOpValueExpException,AttributeModificationException,
	javax.management.BadStringOperationException,BerException,CloneNotSupportedException,
	DataBindingException,DatatypeException,DecodingException,ActivationException,EOFException,
	CEFormatException,java.security.GeneralSecurityException,CatalogException,
	CEFormatException,InterruptedException,ActivationException,ActivationException,
	InvalidAttributeValueException,InvalidFormatException,InvalidActivityException,
	AbortException,JarException,CRLException,LinkException,CMMException,javax.sound.midi.MidiUnavailableException,
	MailcapParseException,AcceptPendingException{
		
		
		ExceptionalEvents events=new ExceptionalEvents();
		events.runTimeException();
		events.ArithmeticException(null);
		events.ArrayStoreException();
		events.annotationTypeMismatchException();
		events.bufferOverflowException();
		events.bufferUnderflowException();
		events.cannotRedoException();
		events.cannotUndoException();
		events.cMMException();
		events.concurrentModificationException();
		events. dataBindingException();
		events. dOMException();
		events.emptyStackException();
		events.enumConstantNotPresentException();
		events.eventException();
		events.fileSystemAlreadyExistsException();
		events.fileSystemNotFoundException();
		events.illegalArgumentException();
		events.illegalMonitorStateException();
		events.illegalPathStateException();
		events.illegalStateException();
		events.IllformedLocaleException();
		events.imagingOpException();
		events.incompleteAnnotationException();
		events.indexOutOfBoundsException();
		events.jMRuntimeException();
		events.lSException();
		events.malformedParameterizedTypeException();
		events. mirroredTypesException();
		events.missingResourceException();
		events.negativeArraySizeException();
		events.noSuchElementException();
		events.nullPointerException();
		
		events.exception();
		events.aclNotFoundException();
		events.activationException();
		events.alreadyBoundException();
		events.applicationException();
		events.backingStoreException();
		events. badAttributeValueExpException();
		events.badBinaryOpValueExpException();
		events.badLocationException();
		events.badStringOperationException();
		events.brokenBarrierException();
		events.cloneNotSupportedException();
		events.dataFormatException();
		events.datatypeConfigurationException();
		events.destroyFailedException();
		events.executionException();
		events.expandVetoException();
		events.fontFormatException();
		events.generalSecurityException();
		events.gSSException();
		events.illegalClassFormatException();
		events.interruptedException();
		events.introspectionException();
		events. invalidApplicationException();
		events.invalidMidiDataException();
		events.invalidPreferencesFormatException();
		events.invalidTargetObjectTypeException();
		events.iOException();
		events. lAXBException();
		events.lastOwnerException();
		events.lineUnavailableException();
		events. marshalException();
		events. midiUnavailableException();
		events. mimeTypeParseException();
		events.namingException();
		
		events.error1();
		events.error2();
		events.error3();
		events.error4();
		events.error5();
		events.error6();
		events.error7();
		events.error8();
		events.error9();
		events.error10();
		events.error11();
		events.error12();
		events.error13();
		events.error14();
		events.error15();
		events.error16();
		events.error17();
		events.error18();
		events.error19();
		events.error20();
		events.error21();
		events.error22();
		events.error23();
		events.error24();
		events.error25();
		events.error26();
		events.error27();
		events.error28();
		events.error29();
		events.error30();
		
		
		System.out.println("After exceptions");

	}

}
