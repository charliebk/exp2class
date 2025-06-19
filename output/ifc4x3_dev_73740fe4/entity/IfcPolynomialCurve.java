package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.List;

public class IfcPolynomialCurve extends IfcCurve {

    public IfcPlacement Position;
    // INVERSE attributes:
    // CorrectPositionDim : ((Position.Dim=2) AND (NOT EXISTS(CoefficientsZ))) OR (Position.Dim=3);
    // ValidCoefficients : (EXISTS(CoefficientsX) AND EXISTS(CoefficientsY)) OR (EXISTS(CoefficientsX) AND EXISTS(CoefficientsZ)) OR (EXISTS(CoefficientsY) AND EXISTS(CoefficientsZ)) OR (EXISTS(CoefficientsX) AND EXISTS(CoefficientsY) AND EXISTS(CoefficientsZ));

    // WHERE constraints:
    // CorrectPositionDim : ((Position.Dim=2) AND (NOT EXISTS(CoefficientsZ))) OR (Position.Dim=3);
    // ValidCoefficients : (EXISTS(CoefficientsX) AND EXISTS(CoefficientsY)) OR (EXISTS(CoefficientsX) AND EXISTS(CoefficientsZ)) OR (EXISTS(CoefficientsY) AND EXISTS(CoefficientsZ)) OR (EXISTS(CoefficientsX) AND EXISTS(CoefficientsY) AND EXISTS(CoefficientsZ));
}
