class IfcStructuralPlanarAction(IfcStructuralSurfaceAction):
    def __init__(self):
        pass

    # === WHERE CLAUSES ===
    # ConstPredefinedType : SELF\IfcStructuralSurfaceAction.PredefinedType = IfcStructuralSurfaceActivityTypeEnum.CONST
    # SuitableLoadType : SIZEOF(['IFC4X3_DEV_73740fe4.IFCSTRUCTURALLOADPLANARFORCE', 'IFC4X3_DEV_73740fe4.IFCSTRUCTURALLOADTEMPERATURE'] * TYPEOF(SELF\IfcStructuralActivity.AppliedLoad)) = 1
