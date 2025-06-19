package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public class IfcBooleanResult extends IfcGeometricRepresentationItem {

    public IfcBooleanOperator Operator;
    public IfcBooleanOperand FirstOperand;
    public IfcBooleanOperand SecondOperand;
    // INVERSE attributes:
    // Dim : IfcDimensionCount := FirstOperand.Dim;
    // INVERSE attributes:
    // FirstOperandClosed : NOT('IFC4X3_DEV_73740fe4.IFCTESSELLATEDFACESET' IN TYPEOF(FirstOperand)) OR (EXISTS(FirstOperand.Closed) AND FirstOperand.Closed);
    // SameDim : FirstOperand.Dim = SecondOperand.Dim;
    // SecondOperandClosed : NOT('IFC4X3_DEV_73740fe4.IFCTESSELLATEDFACESET' IN TYPEOF(SecondOperand)) OR (EXISTS(SecondOperand.Closed) AND SecondOperand.Closed);

    // SUPERTYPE OF:
    // - IfcBooleanClippingResult SUBTYPE OF IfcGeometricRepresentationItem

    // WHERE constraints:
    // FirstOperandClosed : NOT('IFC4X3_DEV_73740fe4.IFCTESSELLATEDFACESET' IN TYPEOF(FirstOperand)) OR (EXISTS(FirstOperand.Closed) AND FirstOperand.Closed);
    // SameDim : FirstOperand.Dim = SecondOperand.Dim;
    // SecondOperandClosed : NOT('IFC4X3_DEV_73740fe4.IFCTESSELLATEDFACESET' IN TYPEOF(SecondOperand)) OR (EXISTS(SecondOperand.Closed) AND SecondOperand.Closed);
}
