package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.List;

public class IfcTriangulatedFaceSet extends IfcTessellatedFaceSet {

    public IfcBoolean Closed; // OPTIONAL
    // INVERSE attributes:
    // NumberOfTriangles : IfcInteger := SIZEOF(CoordIndex);

    // SUPERTYPE OF:
    // - IfcTriangulatedIrregularNetwork SUBTYPE OF IfcTessellatedFaceSet
}
