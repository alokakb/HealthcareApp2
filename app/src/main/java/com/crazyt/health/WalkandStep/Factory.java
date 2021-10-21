
package com.crazyt.health.WalkandStep;

import android.content.pm.PackageManager;

import com.crazyt.health.WalkandStep.services.AbstractStepDetectorService;
import com.crazyt.health.WalkandStep.services.AccelerometerStepDetectorService;
import com.crazyt.health.WalkandStep.services.HardwareStepDetectorService;
import com.crazyt.health.WalkandStep.utils.AndroidVersionHelper;




public class Factory {



    public static Class<? extends AbstractStepDetectorService> getStepDetectorServiceClass(PackageManager pm){
        if(pm != null && AndroidVersionHelper.supportsStepDetector(pm)) {
            return HardwareStepDetectorService.class;
        }else{
            return AccelerometerStepDetectorService.class;
        }
    }
}
