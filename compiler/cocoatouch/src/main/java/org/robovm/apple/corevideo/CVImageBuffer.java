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
package org.robovm.apple.corevideo;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.opengles.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.iosurface.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreVideo")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CVImageBuffer/*</name>*/ 
    extends /*<extends>*/CVBuffer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(CVImageBuffer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /**
     * @since Available in iOS 4.0 and later.
     */
    public void setAttribute(CVImageBufferAttribute attribute, CFType value, CVAttachmentMode attachmentMode) {
        setAttachment(attribute.value(), value, attachmentMode);
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CFType getAttribute(CVImageBufferAttribute attribute) {
        return getAttachment(attribute.value());
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CVAttachmentMode getAttributeMode(CVImageBufferAttribute attribute) {
        return getAttachmentMode(attribute.value());
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public void removeAttribute(CVImageBufferAttribute attribute) {
        removeAttachment(attribute.value());
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public void removeAllAttributes() {
        removeAllAttachments();
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CVImageBufferAttributes getAttributes(CVAttachmentMode attachmentMode) {
        return new CVImageBufferAttributes(getAttachments(attachmentMode).as(CFDictionary.class));
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    @SuppressWarnings("unchecked")
    public void setAttributes(CVImageBufferAttributes attributes, CVAttachmentMode attachmentMode) {
        setAttachments(attributes.getDictionary().as(NSDictionary.class), attachmentMode);
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public void propagateAttributes(CVImageBuffer destinationBuffer) {
        propagateAttachments(destinationBuffer);
    }
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Bridge(symbol="CVYCbCrMatrixGetIntegerCodePointForString", optional=true)
    public static native int toIntCodePointCVYCbCrMatrix(CFString yCbCrMatrixString);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Bridge(symbol="CVColorPrimariesGetIntegerCodePointForString", optional=true)
    public static native int toIntCodePointCVColorPrimaries(CFString colorPrimariesString);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Bridge(symbol="CVTransferFunctionGetIntegerCodePointForString", optional=true)
    public static native int toIntCodePointCVTransferFunction(CFString transferFunctionString);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Bridge(symbol="CVYCbCrMatrixGetStringForIntegerCodePoint", optional=true)
    public static native CFString intCodePointToStringCVYCbCrMatrix(int yCbCrMatrixCodePoint);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Bridge(symbol="CVColorPrimariesGetStringForIntegerCodePoint", optional=true)
    public static native CFString intCodePointToStringCVColorPrimaries(int colorPrimariesCodePoint);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Bridge(symbol="CVTransferFunctionGetStringForIntegerCodePoint", optional=true)
    public static native CFString intCodePointToStringCVTransferFunction(int transferFunctionCodePoint);
    @Bridge(symbol="CVImageBufferGetEncodedSize", optional=true)
    public native @ByVal CGSize getEncodedSize();
    @Bridge(symbol="CVImageBufferGetDisplaySize", optional=true)
    public native @ByVal CGSize getDisplaySize();
    @Bridge(symbol="CVImageBufferGetCleanRect", optional=true)
    public native @ByVal CGRect getCleanRect();
    @Bridge(symbol="CVImageBufferIsFlipped", optional=true)
    public native boolean isFlipped();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Bridge(symbol="CVImageBufferCreateColorSpaceFromAttachments", optional=true)
    public static native CGColorSpace createColorSpaceFromAttachments(CFDictionary attachments);
    /*</methods>*/
}
