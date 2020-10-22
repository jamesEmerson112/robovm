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
package org.robovm.apple.mediaplayer;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class) @Deprecated/*</annotations>*/
public enum /*<name>*/MPMovieScalingMode/*</name>*/ implements ValuedEnum {
    /*<values>*/
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    None(0L),
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    AspectFit(1L),
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    AspectFill(2L),
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    Fill(3L);
    /*</values>*/

    private final long n;

    private /*<name>*/MPMovieScalingMode/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/MPMovieScalingMode/*</name>*/ valueOf(long n) {
        for (/*<name>*/MPMovieScalingMode/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/MPMovieScalingMode/*</name>*/.class.getName());
    }
}
