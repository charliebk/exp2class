class IfcStructuralAnalysisModel extends IfcSystem {
    constructor() {
        /** @type {IFCANALYSISMODELTYPEENUM} */
        this.PredefinedType = null;
        /** @type {IFCAXIS2PLACEMENT3D} */
        this.OrientationOf2DPlane = null;
        /** @type {SET [1:?] OF IFCSTRUCTURALLOADGROUP} */
        this.LoadedBy = null;
        /** @type {SET [1:?] OF IFCSTRUCTURALRESULTGROUP} */
        this.HasResults = null;
        /** @type {IFCOBJECTPLACEMENT} */
        this.SharedPlacement = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcAnalysisModelTypeEnum.USERDEFINED) OR ((PredefinedType = IfcAnalysisModelTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
