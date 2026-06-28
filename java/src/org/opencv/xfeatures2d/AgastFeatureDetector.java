//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.xfeatures2d;

import org.opencv.features.Feature2D;
import org.opencv.xfeatures2d.AgastFeatureDetector;

// C++: class AgastFeatureDetector
/**
 * Wrapping class for feature detection using the AGAST method. :
 */
public class AgastFeatureDetector extends Feature2D {

    protected AgastFeatureDetector(long addr) { super(addr); }

    // internal usage only
    public static AgastFeatureDetector __fromPtr__(long addr) { return new AgastFeatureDetector(addr); }

    // C++: enum <unnamed>
    public static final int
            AGAST_5_8 = 0,
            AGAST_7_12d = 1,
            AGAST_7_12s = 2,
            OAST_9_16 = 3,
            THRESHOLD = 10000,
            NONMAX_SUPPRESSION = 10001;


    //
    // C++: static Ptr_AgastFeatureDetector cv::xfeatures2d::AgastFeatureDetector::create(int threshold = 10, bool nonmaxSuppression = true, int type = AgastFeatureDetector::OAST_9_16)
    //

    public static AgastFeatureDetector create(int threshold, boolean nonmaxSuppression, int type) {
        return AgastFeatureDetector.__fromPtr__(create_0(threshold, nonmaxSuppression, type));
    }

    public static AgastFeatureDetector create(int threshold, boolean nonmaxSuppression) {
        return AgastFeatureDetector.__fromPtr__(create_1(threshold, nonmaxSuppression));
    }

    public static AgastFeatureDetector create(int threshold) {
        return AgastFeatureDetector.__fromPtr__(create_2(threshold));
    }

    public static AgastFeatureDetector create() {
        return AgastFeatureDetector.__fromPtr__(create_3());
    }


    //
    // C++:  void cv::xfeatures2d::AgastFeatureDetector::setThreshold(int threshold)
    //

    public void setThreshold(int threshold) {
        setThreshold_0(nativeObj, threshold);
    }


    //
    // C++:  int cv::xfeatures2d::AgastFeatureDetector::getThreshold()
    //

    public int getThreshold() {
        return getThreshold_0(nativeObj);
    }


    //
    // C++:  void cv::xfeatures2d::AgastFeatureDetector::setNonmaxSuppression(bool f)
    //

    public void setNonmaxSuppression(boolean f) {
        setNonmaxSuppression_0(nativeObj, f);
    }


    //
    // C++:  bool cv::xfeatures2d::AgastFeatureDetector::getNonmaxSuppression()
    //

    public boolean getNonmaxSuppression() {
        return getNonmaxSuppression_0(nativeObj);
    }


    //
    // C++:  void cv::xfeatures2d::AgastFeatureDetector::setType(int type)
    //

    public void setType(int type) {
        setType_0(nativeObj, type);
    }


    //
    // C++:  int cv::xfeatures2d::AgastFeatureDetector::getType()
    //

    public int getType() {
        return getType_0(nativeObj);
    }


    //
    // C++:  String cv::xfeatures2d::AgastFeatureDetector::getDefaultName()
    //

    public String getDefaultName() {
        return getDefaultName_0(nativeObj);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_AgastFeatureDetector cv::xfeatures2d::AgastFeatureDetector::create(int threshold = 10, bool nonmaxSuppression = true, int type = AgastFeatureDetector::OAST_9_16)
    private static native long create_0(int threshold, boolean nonmaxSuppression, int type);
    private static native long create_1(int threshold, boolean nonmaxSuppression);
    private static native long create_2(int threshold);
    private static native long create_3();

    // C++:  void cv::xfeatures2d::AgastFeatureDetector::setThreshold(int threshold)
    private static native void setThreshold_0(long nativeObj, int threshold);

    // C++:  int cv::xfeatures2d::AgastFeatureDetector::getThreshold()
    private static native int getThreshold_0(long nativeObj);

    // C++:  void cv::xfeatures2d::AgastFeatureDetector::setNonmaxSuppression(bool f)
    private static native void setNonmaxSuppression_0(long nativeObj, boolean f);

    // C++:  bool cv::xfeatures2d::AgastFeatureDetector::getNonmaxSuppression()
    private static native boolean getNonmaxSuppression_0(long nativeObj);

    // C++:  void cv::xfeatures2d::AgastFeatureDetector::setType(int type)
    private static native void setType_0(long nativeObj, int type);

    // C++:  int cv::xfeatures2d::AgastFeatureDetector::getType()
    private static native int getType_0(long nativeObj);

    // C++:  String cv::xfeatures2d::AgastFeatureDetector::getDefaultName()
    private static native String getDefaultName_0(long nativeObj);

    // native support for java finalize() or cleaner
    private static native void delete(long nativeObj);

}
