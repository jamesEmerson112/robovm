/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.intents;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.eventkit.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INLodgingReservation/*</name>*/ 
    extends /*<extends>*/INReservation/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class INLodgingReservationPtr extends Ptr<INLodgingReservation, INLodgingReservationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INLodgingReservation.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INLodgingReservation() {}
    protected INLodgingReservation(Handle h, long handle) { super(h, handle); }
    protected INLodgingReservation(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithItemReference:reservationNumber:bookingTime:reservationStatus:reservationHolderName:actions:URL:lodgingBusinessLocation:reservationDuration:numberOfAdults:numberOfChildren:")
    public INLodgingReservation(INSpeakableString itemReference, String reservationNumber, NSDate bookingTime, INReservationStatus reservationStatus, String reservationHolderName, NSArray<INReservationAction> actions, NSURL URL, CLPlacemark lodgingBusinessLocation, INDateComponentsRange reservationDuration, NSNumber numberOfAdults, NSNumber numberOfChildren) { super((SkipInit) null); initObject(init(itemReference, reservationNumber, bookingTime, reservationStatus, reservationHolderName, actions, URL, lodgingBusinessLocation, reservationDuration, numberOfAdults, numberOfChildren)); }
    @Method(selector = "initWithItemReference:reservationNumber:bookingTime:reservationStatus:reservationHolderName:actions:lodgingBusinessLocation:reservationDuration:numberOfAdults:numberOfChildren:")
    public INLodgingReservation(INSpeakableString itemReference, String reservationNumber, NSDate bookingTime, INReservationStatus reservationStatus, String reservationHolderName, NSArray<INReservationAction> actions, CLPlacemark lodgingBusinessLocation, INDateComponentsRange reservationDuration, NSNumber numberOfAdults, NSNumber numberOfChildren) { super((SkipInit) null); initObject(init(itemReference, reservationNumber, bookingTime, reservationStatus, reservationHolderName, actions, lodgingBusinessLocation, reservationDuration, numberOfAdults, numberOfChildren)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "lodgingBusinessLocation")
    public native CLPlacemark getLodgingBusinessLocation();
    @Property(selector = "reservationDuration")
    public native INDateComponentsRange getReservationDuration();
    @Property(selector = "numberOfAdults")
    public native NSNumber getNumberOfAdults();
    @Property(selector = "numberOfChildren")
    public native NSNumber getNumberOfChildren();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithItemReference:reservationNumber:bookingTime:reservationStatus:reservationHolderName:actions:URL:lodgingBusinessLocation:reservationDuration:numberOfAdults:numberOfChildren:")
    protected native @Pointer long init(INSpeakableString itemReference, String reservationNumber, NSDate bookingTime, INReservationStatus reservationStatus, String reservationHolderName, NSArray<INReservationAction> actions, NSURL URL, CLPlacemark lodgingBusinessLocation, INDateComponentsRange reservationDuration, NSNumber numberOfAdults, NSNumber numberOfChildren);
    @Method(selector = "initWithItemReference:reservationNumber:bookingTime:reservationStatus:reservationHolderName:actions:lodgingBusinessLocation:reservationDuration:numberOfAdults:numberOfChildren:")
    protected native @Pointer long init(INSpeakableString itemReference, String reservationNumber, NSDate bookingTime, INReservationStatus reservationStatus, String reservationHolderName, NSArray<INReservationAction> actions, CLPlacemark lodgingBusinessLocation, INDateComponentsRange reservationDuration, NSNumber numberOfAdults, NSNumber numberOfChildren);
    /*</methods>*/
}
