#include <jni.h>

#ifndef _Included_com_example_jnitest_JniClient
#define _Included_com_example_jnitest_JniClient
#ifdef __cplusplus
extern "C" {
#endif
JNIEXPORT jint JNICALL Java_com_example_jnitest_JniClient_AddInt
  (JNIEnv *a, jclass b, jint c, jint d){
	return c + d;
}

#ifdef __cplusplus
}
#endif
#endif
