class IfcMaterialProfileSetUsageTapering extends IfcMaterialProfileSetUsage {
    constructor() {
        /** @type {IFCMATERIALPROFILESET} */
        this.ForProfileEndSet = null;
        /** @type {IFCCARDINALPOINTREFERENCE} */
        this.CardinalEndPoint = null;
    }
}
