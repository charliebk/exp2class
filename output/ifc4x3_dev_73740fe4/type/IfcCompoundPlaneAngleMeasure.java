package com.topoplanet.ifc4x3_dev_73740fe4.type;
import com.topoplanet.test.entity.*;


import java.util.List;

public class IfcCompoundPlaneAngleMeasure {
    public List<Integer> value;

    // WHERE constraints:
    // MinutesInRange : ABS(SELF[2]) < 60;
    // SecondsInRange : ABS(SELF[3]) < 60;
    // MicrosecondsInRange : (SIZEOF(SELF) = 3) OR (ABS(SELF[4]) < 1000000);
    // ConsistentSign : ((SELF[1] >= 0) AND (SELF[2] >= 0) AND (SELF[3] >= 0) AND ((SIZEOF(SELF) = 3) OR (SELF[4] >= 0)))
    // OR
    // ((SELF[1] <= 0) AND (SELF[2] <= 0) AND (SELF[3] <= 0) AND ((SIZEOF(SELF) = 3) OR (SELF[4] <= 0)));
}
