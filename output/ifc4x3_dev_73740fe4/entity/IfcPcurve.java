package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcPcurve extends IfcCurve {

    public IfcSurface BasisSurface;
    public IfcCurve ReferenceCurve;
    // INVERSE attributes:
    // DimIs2D : ReferenceCurve.Dim = 2;

    // WHERE constraints:
    // DimIs2D : ReferenceCurve.Dim = 2;
}
