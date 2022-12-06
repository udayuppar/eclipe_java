package com.uday.exception.exceptionalEvents;

import java.awt.AWTError;
import java.awt.color.CMMException;
import java.awt.image.ImagingOpException;
import java.io.EOFException;
import java.io.IOError;
import java.lang.annotation.AnnotationFormatError;
import java.lang.annotation.AnnotationTypeMismatchException;
import java.lang.annotation.IncompleteAnnotationException;
import java.lang.reflect.GenericSignatureFormatError;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.channels.AcceptPendingException;
import java.nio.channels.AlreadyBoundException;
import java.nio.charset.CoderMalfunctionError;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.FileSystemNotFoundException;
import java.rmi.activation.ActivationException;
import java.security.acl.AclNotFoundException;
import java.security.cert.CRLException;
import java.util.ConcurrentModificationException;
import java.util.EmptyStackException;
import java.util.MissingResourceException;
import java.util.NoSuchElementException;
import java.util.jar.JarException;
import java.util.zip.ZipError;

import javax.activity.InvalidActivityException;
import javax.lang.model.type.MirroredTypesException;
import javax.management.BadAttributeValueExpException;
import javax.management.BadBinaryOpValueExpException;
import javax.management.InvalidAttributeValueException;
import javax.management.JMRuntimeException;
import javax.naming.LinkException;
import javax.naming.directory.AttributeModificationException;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.xml.bind.DataBindingException;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.transform.TransformerFactoryConfigurationError;

import org.omg.CORBA.portable.ApplicationException;
import org.w3c.dom.DOMException;
import org.w3c.dom.events.EventException;
import org.w3c.dom.ls.LSException;
import com.sun.activation.registries.MailcapParseException;
import com.sun.javafx.geom.IllegalPathStateException;
import com.sun.jmx.snmp.BerException;
import com.sun.media.sound.InvalidFormatException;
import com.sun.org.apache.xerces.internal.dom.AbortException;
import com.sun.org.apache.xerces.internal.impl.dv.DatatypeException;
import com.sun.org.apache.xml.internal.resolver.CatalogException;
import com.sun.xml.internal.org.jvnet.mimepull.DecodingException;


import sun.awt.image.BadDepthException;
import sun.misc.CEFormatException;


public class ExceptionalEvents {
	
	public void runTimeException()
	{
		System.out.println("before Exceptions");
		throw new RuntimeException();
		
	}
	public void ArithmeticException(String s)
	{
		throw new ArithmeticException();
	}
	public void ArrayStoreException()
	{
		throw new ArrayStoreException();
	}
	
	public void ClassCastException()
	{
		throw new ClassCastException();
	}
	
	public void annotationTypeMismatchException() {
		throw new AnnotationTypeMismatchException(null, null);
	}
	
	public void bufferOverflowException() {
		throw new BufferOverflowException();
	}
	public void bufferUnderflowException()
	{
		throw new BufferUnderflowException();
	}
	public void cannotRedoException() {
		throw new CannotRedoException();
	}
	public void cannotUndoException() {
		throw new CannotUndoException();
	}
	public void cMMException() {
		throw new CMMException(null);
	}
	public void concurrentModificationException() {
		throw new ConcurrentModificationException();
	}
	public void dataBindingException() {
		throw new DataBindingException(null);
	}
	public void dOMException() {
		throw new DOMException((short) 0, null);
	}
	public void emptyStackException() {
		throw new EmptyStackException();
	}
	public void enumConstantNotPresentException()
	{
		throw new EnumConstantNotPresentException(null, null);
	}
	public void eventException() {
		throw new EventException((short) 0, null);
	}
	public void fileSystemAlreadyExistsException() {
		throw new FileSystemAlreadyExistsException();
	}
	public void fileSystemNotFoundException() {
		throw new FileSystemNotFoundException();
	}
	public void illegalArgumentException() {
		throw new IllegalArgumentException();
	}
	public void illegalMonitorStateException() {
		throw new IllegalMonitorStateException();
	}
	public void  illegalPathStateException() {
		throw new  IllegalPathStateException();
	}
	public void illegalStateException() {
		throw new IllegalStateException();
	}
	public void  IllformedLocaleException() {
		throw new  java.util.IllformedLocaleException();
	}
	public void imagingOpException() {
		throw new ImagingOpException(null);
	}
	public void  incompleteAnnotationException() {
		throw new  IncompleteAnnotationException(null, null);
	}
	public void indexOutOfBoundsException() {
		throw new IndexOutOfBoundsException();
	}
	public void jMRuntimeException() {
		throw new JMRuntimeException();
	}
	public void lSException() {
		throw new LSException((short) 0, null);
	}
	public void malformedParameterizedTypeException() {
		throw new MalformedParameterizedTypeException();
	}
	public void mirroredTypesException() {
		throw new MirroredTypesException(null);
	}
	public void missingResourceException() {
		throw new MissingResourceException(null, null, null);
	}
	public void negativeArraySizeException() {
		throw new NegativeArraySizeException();
	}
	public void noSuchElementException() {
		throw new NoSuchElementException();
	}
	public void nullPointerException() {
		throw new NullPointerException();
	}
	

	 //***************************************************************************//
	
    public void exception() throws Exception
	{
		throw new Exception();
	}
    public void aclNotFoundException()throws AclNotFoundException{
    	throw new AclNotFoundException();
    }
    public void activationException()throws ActivationException{
    	throw new ActivationException();
    }
    public void alreadyBoundException()throws AlreadyBoundException{
    	throw new AlreadyBoundException();
    }
    public void applicationException()throws ApplicationException{
    	throw new ApplicationException(null, null);
    }
    public void backingStoreException()throws BadDepthException{
    	throw new BadDepthException();
    }
    public void badAttributeValueExpException()throws BadAttributeValueExpException, javax.management.BadBinaryOpValueExpException{
    	throw new BadBinaryOpValueExpException(null);
    }
    public void badBinaryOpValueExpException()throws BadBinaryOpValueExpException{
    	throw new BadBinaryOpValueExpException(null);
    }
    public void badLocationException()throws AttributeModificationException{
    	throw new AttributeModificationException();
    }
    public void badStringOperationException()throws javax.management.BadStringOperationException{
    	throw new javax.management.BadStringOperationException(null);
    }
    public void brokenBarrierException()throws BerException{
    	throw new BerException();
    }
    public void cloneNotSupportedException()throws CloneNotSupportedException{
    	throw new CloneNotSupportedException(null);
    }
    public void dataFormatException()throws DataBindingException{
    	throw new DataBindingException(null);
    }
    public void datatypeConfigurationException()throws DatatypeException{
    	throw new DatatypeException(null, null);
    }
    public void destroyFailedException()throws DecodingException{
    	throw new DecodingException(null);
    }
    public void executionException()throws ActivationException{
    	throw new ActivationException();
    }
    public void expandVetoException()throws EOFException{
    	throw new EOFException();
    }
    public void fontFormatException()throws CEFormatException{
    	throw new CEFormatException(null);
    }
    public void generalSecurityException()throws java.security.GeneralSecurityException{
    	throw new java.security.GeneralSecurityException();
    }
    public void gSSException()throws CatalogException{
    	throw new CatalogException(0);
    }
    public void illegalClassFormatException()throws CEFormatException{
    	throw new CEFormatException(null);
    }
    public void interruptedException()throws InterruptedException{
    	throw new InterruptedException();
    }
    public void introspectionException()throws ActivationException{
    	throw new ActivationException();
    }
    public void  invalidApplicationException()throws  ActivationException{
    	throw new  ActivationException();
    }
    public void invalidMidiDataException()throws InvalidAttributeValueException{
    	throw new InvalidAttributeValueException();
    }
    public void invalidPreferencesFormatException()throws InvalidFormatException{
    	throw new InvalidFormatException();
    }
    public void invalidTargetObjectTypeException()throws InvalidActivityException{
    	throw new InvalidActivityException();
    }
    public void iOException()throws AbortException{
    	throw new AbortException();
    }
    public void lAXBException()throws JarException{
    	throw new JarException();
    }
    public void lastOwnerException()throws CRLException{
    	throw new CRLException();
    }
    public void lineUnavailableException()throws LinkException{
    	throw new LinkException();
    }
    public void marshalException()throws CMMException{
    	throw new CMMException(null);
    }
    public void midiUnavailableException()throws javax.sound.midi.MidiUnavailableException{
    	throw new javax.sound.midi.MidiUnavailableException();
    }
    public void mimeTypeParseException()throws MailcapParseException{
    	throw new MailcapParseException();
    }
    public void namingException()throws AcceptPendingException{
    	throw new AcceptPendingException();
    }
    
    //***********************************************************************//
    
    public void error1(){
    	throw new AnnotationFormatError(null,null);
    }
    public void error2() {
		throw new AssertionError();
	}

	public void error3() {
		throw new AWTError(null);
	}

	public void error4() {
		throw new CoderMalfunctionError(null);
	}

	public void error5() {
		throw new FactoryConfigurationError();
	}

	public void error6() {
		throw new FactoryConfigurationError();
	}

	public void error7() {
		throw new IOError(null);
	}

	public void error8() {
		throw new LinkageError();
	}

	public void error9() {
		throw new BootstrapMethodError();
	}

	public void error10() {
		throw new ClassCircularityError();
	}

	public void error11() {
		throw new ClassFormatError();
	}

	public void error12() {
		throw new ExceptionInInitializerError();
	}

	public void error13() {
		throw new IncompatibleClassChangeError();
	}

	public void error14() {
		throw new GenericSignatureFormatError();
	}

	public void error15() {
		throw new UnsupportedClassVersionError();
	}

	public void error16() {
		throw new IncompatibleClassChangeError(null);
	}

	public void error17() {
		throw new AbstractMethodError();
	}

	public void error18() {
		throw new IllegalAccessError();
	}

	public void error19() {
		throw new InstantiationError();
	}

	public void error20() {
		throw new NoSuchFieldError();
	}

	public void error21() {
		throw new NoSuchMethodError();
	}

	public void error22() {
		throw new NoClassDefFoundError();
	}

	public void error23() {
		throw new UnsatisfiedLinkError();
	}

	public void error24() {
		throw new VerifyError();
	}

	public void error25() {
		throw new ZipError(null);
	}

	public void error26() {
		throw new ThreadDeath();
	}

	public void error27() {
		throw new TransformerFactoryConfigurationError();
	}

	public void error28() {
		throw new OutOfMemoryError();
	}

	public void error29() {
		throw new InternalError();
	}

	public void error30() {
		throw new StackOverflowError();
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}

