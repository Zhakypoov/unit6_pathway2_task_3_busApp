package com.example.busschedule.data

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = arrayOf(BusSchedule::class), version = 1)
abstract class AppDatabase: RoomDatabase(){
   abstract fun busScheduleDao(): BusScheduleDao
}