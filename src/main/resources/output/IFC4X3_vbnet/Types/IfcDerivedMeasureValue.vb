' SELECT TYPE IfcDerivedMeasureValue
' Options:
' - IfcAbsorbedDoseMeasure
' - IfcAccelerationMeasure
' - IfcAngularVelocityMeasure
' - IfcAreaDensityMeasure
' - IfcCompoundPlaneAngleMeasure
' - IfcCurvatureMeasure
' - IfcDoseEquivalentMeasure
' - IfcDynamicViscosityMeasure
' - IfcElectricCapacitanceMeasure
' - IfcElectricChargeMeasure
' - IfcElectricConductanceMeasure
' - IfcElectricResistanceMeasure
' - IfcElectricVoltageMeasure
' - IfcEnergyMeasure
' - IfcForceMeasure
' - IfcFrequencyMeasure
' - IfcHeatFluxDensityMeasure
' - IfcHeatingValueMeasure
' - IfcIlluminanceMeasure
' - IfcInductanceMeasure
' - IfcIntegerCountRateMeasure
' - IfcIonConcentrationMeasure
' - IfcIsothermalMoistureCapacityMeasure
' - IfcKinematicViscosityMeasure
' - IfcLinearForceMeasure
' - IfcLinearMomentMeasure
' - IfcLinearStiffnessMeasure
' - IfcLinearVelocityMeasure
' - IfcLuminousFluxMeasure
' - IfcLuminousIntensityDistributionMeasure
' - IfcMagneticFluxDensityMeasure
' - IfcMagneticFluxMeasure
' - IfcMassDensityMeasure
' - IfcMassFlowRateMeasure
' - IfcMassPerLengthMeasure
' - IfcModulusOfElasticityMeasure
' - IfcModulusOfLinearSubgradeReactionMeasure
' - IfcModulusOfRotationalSubgradeReactionMeasure
' - IfcModulusOfSubgradeReactionMeasure
' - IfcMoistureDiffusivityMeasure
' - IfcMolecularWeightMeasure
' - IfcMomentOfInertiaMeasure
' - IfcMonetaryMeasure
' - IfcPHMeasure
' - IfcPlanarForceMeasure
' - IfcPowerMeasure
' - IfcPressureMeasure
' - IfcRadioActivityMeasure
' - IfcRotationalFrequencyMeasure
' - IfcRotationalMassMeasure
' - IfcRotationalStiffnessMeasure
' - IfcSectionModulusMeasure
' - IfcSectionalAreaIntegralMeasure
' - IfcShearModulusMeasure
' - IfcSoundPowerLevelMeasure
' - IfcSoundPowerMeasure
' - IfcSoundPressureLevelMeasure
' - IfcSoundPressureMeasure
' - IfcSpecificHeatCapacityMeasure
' - IfcTemperatureGradientMeasure
' - IfcTemperatureRateOfChangeMeasure
' - IfcThermalAdmittanceMeasure
' - IfcThermalConductivityMeasure
' - IfcThermalExpansionCoefficientMeasure
' - IfcThermalResistanceMeasure
' - IfcThermalTransmittanceMeasure
' - IfcTorqueMeasure
' - IfcVaporPermeabilityMeasure
' - IfcVolumetricFlowRateMeasure
' - IfcWarpingConstantMeasure
' - IfcWarpingMomentMeasure
Public Class IfcDerivedMeasureValue
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcAbsorbedDoseMeasure OrElse TypeOf value Is IfcAccelerationMeasure OrElse TypeOf value Is IfcAngularVelocityMeasure OrElse TypeOf value Is IfcAreaDensityMeasure OrElse TypeOf value Is IfcCompoundPlaneAngleMeasure OrElse TypeOf value Is IfcCurvatureMeasure OrElse TypeOf value Is IfcDoseEquivalentMeasure OrElse TypeOf value Is IfcDynamicViscosityMeasure OrElse TypeOf value Is IfcElectricCapacitanceMeasure OrElse TypeOf value Is IfcElectricChargeMeasure OrElse TypeOf value Is IfcElectricConductanceMeasure OrElse TypeOf value Is IfcElectricResistanceMeasure OrElse TypeOf value Is IfcElectricVoltageMeasure OrElse TypeOf value Is IfcEnergyMeasure OrElse TypeOf value Is IfcForceMeasure OrElse TypeOf value Is IfcFrequencyMeasure OrElse TypeOf value Is IfcHeatFluxDensityMeasure OrElse TypeOf value Is IfcHeatingValueMeasure OrElse TypeOf value Is IfcIlluminanceMeasure OrElse TypeOf value Is IfcInductanceMeasure OrElse TypeOf value Is IfcIntegerCountRateMeasure OrElse TypeOf value Is IfcIonConcentrationMeasure OrElse TypeOf value Is IfcIsothermalMoistureCapacityMeasure OrElse TypeOf value Is IfcKinematicViscosityMeasure OrElse TypeOf value Is IfcLinearForceMeasure OrElse TypeOf value Is IfcLinearMomentMeasure OrElse TypeOf value Is IfcLinearStiffnessMeasure OrElse TypeOf value Is IfcLinearVelocityMeasure OrElse TypeOf value Is IfcLuminousFluxMeasure OrElse TypeOf value Is IfcLuminousIntensityDistributionMeasure OrElse TypeOf value Is IfcMagneticFluxDensityMeasure OrElse TypeOf value Is IfcMagneticFluxMeasure OrElse TypeOf value Is IfcMassDensityMeasure OrElse TypeOf value Is IfcMassFlowRateMeasure OrElse TypeOf value Is IfcMassPerLengthMeasure OrElse TypeOf value Is IfcModulusOfElasticityMeasure OrElse TypeOf value Is IfcModulusOfLinearSubgradeReactionMeasure OrElse TypeOf value Is IfcModulusOfRotationalSubgradeReactionMeasure OrElse TypeOf value Is IfcModulusOfSubgradeReactionMeasure OrElse TypeOf value Is IfcMoistureDiffusivityMeasure OrElse TypeOf value Is IfcMolecularWeightMeasure OrElse TypeOf value Is IfcMomentOfInertiaMeasure OrElse TypeOf value Is IfcMonetaryMeasure OrElse TypeOf value Is IfcPHMeasure OrElse TypeOf value Is IfcPlanarForceMeasure OrElse TypeOf value Is IfcPowerMeasure OrElse TypeOf value Is IfcPressureMeasure OrElse TypeOf value Is IfcRadioActivityMeasure OrElse TypeOf value Is IfcRotationalFrequencyMeasure OrElse TypeOf value Is IfcRotationalMassMeasure OrElse TypeOf value Is IfcRotationalStiffnessMeasure OrElse TypeOf value Is IfcSectionModulusMeasure OrElse TypeOf value Is IfcSectionalAreaIntegralMeasure OrElse TypeOf value Is IfcShearModulusMeasure OrElse TypeOf value Is IfcSoundPowerLevelMeasure OrElse TypeOf value Is IfcSoundPowerMeasure OrElse TypeOf value Is IfcSoundPressureLevelMeasure OrElse TypeOf value Is IfcSoundPressureMeasure OrElse TypeOf value Is IfcSpecificHeatCapacityMeasure OrElse TypeOf value Is IfcTemperatureGradientMeasure OrElse TypeOf value Is IfcTemperatureRateOfChangeMeasure OrElse TypeOf value Is IfcThermalAdmittanceMeasure OrElse TypeOf value Is IfcThermalConductivityMeasure OrElse TypeOf value Is IfcThermalExpansionCoefficientMeasure OrElse TypeOf value Is IfcThermalResistanceMeasure OrElse TypeOf value Is IfcThermalTransmittanceMeasure OrElse TypeOf value Is IfcTorqueMeasure OrElse TypeOf value Is IfcVaporPermeabilityMeasure OrElse TypeOf value Is IfcVolumetricFlowRateMeasure OrElse TypeOf value Is IfcWarpingConstantMeasure OrElse TypeOf value Is IfcWarpingMomentMeasure) Then
            Throw New ArgumentException("Value must be one of: IfcAbsorbedDoseMeasure, IfcAccelerationMeasure, IfcAngularVelocityMeasure, IfcAreaDensityMeasure, IfcCompoundPlaneAngleMeasure, IfcCurvatureMeasure, IfcDoseEquivalentMeasure, IfcDynamicViscosityMeasure, IfcElectricCapacitanceMeasure, IfcElectricChargeMeasure, IfcElectricConductanceMeasure, IfcElectricResistanceMeasure, IfcElectricVoltageMeasure, IfcEnergyMeasure, IfcForceMeasure, IfcFrequencyMeasure, IfcHeatFluxDensityMeasure, IfcHeatingValueMeasure, IfcIlluminanceMeasure, IfcInductanceMeasure, IfcIntegerCountRateMeasure, IfcIonConcentrationMeasure, IfcIsothermalMoistureCapacityMeasure, IfcKinematicViscosityMeasure, IfcLinearForceMeasure, IfcLinearMomentMeasure, IfcLinearStiffnessMeasure, IfcLinearVelocityMeasure, IfcLuminousFluxMeasure, IfcLuminousIntensityDistributionMeasure, IfcMagneticFluxDensityMeasure, IfcMagneticFluxMeasure, IfcMassDensityMeasure, IfcMassFlowRateMeasure, IfcMassPerLengthMeasure, IfcModulusOfElasticityMeasure, IfcModulusOfLinearSubgradeReactionMeasure, IfcModulusOfRotationalSubgradeReactionMeasure, IfcModulusOfSubgradeReactionMeasure, IfcMoistureDiffusivityMeasure, IfcMolecularWeightMeasure, IfcMomentOfInertiaMeasure, IfcMonetaryMeasure, IfcPHMeasure, IfcPlanarForceMeasure, IfcPowerMeasure, IfcPressureMeasure, IfcRadioActivityMeasure, IfcRotationalFrequencyMeasure, IfcRotationalMassMeasure, IfcRotationalStiffnessMeasure, IfcSectionModulusMeasure, IfcSectionalAreaIntegralMeasure, IfcShearModulusMeasure, IfcSoundPowerLevelMeasure, IfcSoundPowerMeasure, IfcSoundPressureLevelMeasure, IfcSoundPressureMeasure, IfcSpecificHeatCapacityMeasure, IfcTemperatureGradientMeasure, IfcTemperatureRateOfChangeMeasure, IfcThermalAdmittanceMeasure, IfcThermalConductivityMeasure, IfcThermalExpansionCoefficientMeasure, IfcThermalResistanceMeasure, IfcThermalTransmittanceMeasure, IfcTorqueMeasure, IfcVaporPermeabilityMeasure, IfcVolumetricFlowRateMeasure, IfcWarpingConstantMeasure, IfcWarpingMomentMeasure")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
