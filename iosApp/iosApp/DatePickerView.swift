//
//  DatePicker.swift
//  iosApp
//
//  Created by Nataliia Mantrova on 26.04.2025.
//  Copyright © 2025 orgName. All rights reserved.
//

import SwiftUI
import ComposeApp

struct DatePickerView: View {
    var onDateSelect: (KotlinLong) -> Void
    var onDismiss: () -> Void
    
    @State private var selectedDate: Date = Date()
    @State private var showDatePicker = true
    
    var body: some View {
        VStack {}
            .padding()
            .sheet(isPresented: $showDatePicker, onDismiss: { onDismiss() }) {
                VStack {
                    DatePicker(
                        "Select a Date",
                        selection: $selectedDate,
                        displayedComponents: .date
                    )
                    .datePickerStyle(.graphical)
                    HStack(spacing: 20) {
                        Spacer()
                        Button("Cancel") {
                            onDismiss()
                        }
                        Button("OK") {
                            let millis = KotlinLong(value: Int64(selectedDate.timeIntervalSince1970 * 1000))
                            onDateSelect(millis)
                            onDismiss()
                        }
                        .padding()
                    }
                }
            }
    }
}




