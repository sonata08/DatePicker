//
//  NativeViewFactory.swift
//  iosApp
//
//  Created by Nataliia Mantrova on 26.04.2025.
//  Copyright © 2025 orgName. All rights reserved.
//

import SwiftUI
import ComposeApp


class IOSNativeViewFactory: NativeViewFactory {
    static var shared = IOSNativeViewFactory()
    
    func createDatePickerView(
        onDateSelect: @escaping (KotlinLong) -> Void,
        onDismiss: @escaping () -> Void
    ) -> UIViewController {
        let view = DatePickerView(onDateSelect: onDateSelect, onDismiss: onDismiss)
        return UIHostingController(rootView: view)
    }
    
    func createProvideTextView(
        text: String,
        onDone: @escaping (String) -> Void,
        onDismiss: @escaping () -> Void
    ) -> UIViewController {
        let view = ProvideTextView(text: text, onDone: onDone, onDismiss: onDismiss)
        return UIHostingController(rootView: view)
    }
}
