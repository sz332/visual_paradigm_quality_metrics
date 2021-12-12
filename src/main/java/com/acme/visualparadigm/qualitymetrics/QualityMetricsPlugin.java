package com.acme.visualparadigm.qualitymetrics;

import com.vp.plugin.VPPlugin;
import com.vp.plugin.VPPluginInfo;

import javax.swing.*;

public class QualityMetricsPlugin implements VPPlugin {

  @Override
  public void loaded(VPPluginInfo vpPluginInfo) {
    System.out.println("Quality Metrics plugin loaded!");
    SwingUtilities.invokeLater(() -> JOptionPane.showMessageDialog(null, "Quality Metrics plugin loaded"));
  }

  @Override
  public void unloaded() {
    System.out.println("Quality Metrics plugin unloaded!");
  }
}