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
package org.robovm.apple.uikit;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.cloudkit.*;
import org.robovm.apple.fileprovider.*;
import org.robovm.apple.intents.*;
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.linkpresentation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/NSLineBreakStrategy/*</name>*/ extends Bits</*<name>*/NSLineBreakStrategy/*</name>*/> {
    /*<values>*/
    public static final NSLineBreakStrategy None = new NSLineBreakStrategy(0L);
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final NSLineBreakStrategy PushOut = new NSLineBreakStrategy(1L);
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final NSLineBreakStrategy HangulWordPriority = new NSLineBreakStrategy(2L);
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final NSLineBreakStrategy Standard = new NSLineBreakStrategy(65535L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/NSLineBreakStrategy/*</name>*/[] values = _values(/*<name>*/NSLineBreakStrategy/*</name>*/.class);

    public /*<name>*/NSLineBreakStrategy/*</name>*/(long value) { super(value); }
    private /*<name>*/NSLineBreakStrategy/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/NSLineBreakStrategy/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/NSLineBreakStrategy/*</name>*/(value, mask);
    }
    protected /*<name>*/NSLineBreakStrategy/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/NSLineBreakStrategy/*</name>*/[] values() {
        return values.clone();
    }
}
