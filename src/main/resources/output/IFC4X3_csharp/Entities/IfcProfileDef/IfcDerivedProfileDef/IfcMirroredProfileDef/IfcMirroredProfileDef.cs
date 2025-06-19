public class IfcMirroredProfileDef : IfcDerivedProfileDef
{

    // === DERIVE CLAUSES ===
    // SELF\IfcDerivedProfileDef.Operator : IfcCartesianTransformationOperator2D := IfcRepresentationItem() || IfcGeometricRepresentationItem() || IfcCartesianTransformationOperator( -- Axis1 IfcRepresentationItem() || IfcGeometricRepresentationItem() || IfcDirection([-1., 0.]), -- Axis2 IfcRepresentationItem() || IfcGeometricRepresentationItem() || IfcDirection([ 0., 1.]), -- LocalOrigin IfcRepresentationItem() || IfcGeometricRepresentationItem() || IfcPoint() || IfcCartesianPoint([0., 0.]), -- Scale 1.) || IfcCartesianTransformationOperator2D()
}
